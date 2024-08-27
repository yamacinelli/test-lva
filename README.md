
# Introdução

a. Descrição da atividade:
- Realizar testes de valor limite para verificar a funcionalidade de uma aplicação que calcula cashback com base no valor da compra e no grau de fidelidade do cliente.

b. Objetivo dos testes:
- O objetivo dos testes é garantir que a aplicação calcula corretamente o cashback em cenários críticos, como valores próximos aos limites das faixas de cashback e níveis de fidelidade. A funcionalidade da aplicação consiste em determinar o valor de cashback que um cliente recebe, dependendo da quantia da compra e de seu nível de fidelidade. Esses testes são importantes para identificar possíveis falhas ou comportamentos inesperados que podem ocorrer em valores extremos, assegurando que a aplicação funcione de maneira precisa e confiável em todas as situações.

c. Conceito de análise de valor limite:
- A análise de valor limite é uma técnica de teste de software que foca nos valores extremos (limites) de entrada em uma aplicação, como os menores e maiores valores possíveis dentro de uma faixa. Ela é importante porque esses limites são onde os erros ocorrem com maior frequência, devido à complexidade de transições de estados ou condições de contorno no código. Testar esses limites ajuda a identificar e corrigir falhas que poderiam passar despercebidas em testes mais gerais.

# Análise de Valor Limite

a. Projete Casos de teste que satisfaçam a análise do valor limite:

i. Liste e descreva cada caso de teste:

- Caso de teste BRONZE abaixo do esperado: Verifica se o cashback para o nível "Bronze" está correto para um valor de compra que resulta em cashback próximo ao limite inferior esperado.
- Caso de teste BRONZE acima do esperado: Verifica se o cashback para o nível "Bronze" está correto para um valor de compra que resulta em cashback próximo ao limite superior esperado.
- Caso de teste PRATA abaixo do esperado: Testa se o cashback para o nível "Prata" está correto para um valor de compra próximo ao limite inferior esperado.
- Caso de teste PRATA acima do esperado: Testa se o cashback para o nível "Prata" está correto para um valor de compra próximo ao limite superior esperado.
- Caso de teste OURO abaixo do esperado: Avalia se o cashback para o nível "Ouro" está correto para um valor de compra próximo ao limite inferior esperado.
- Caso de teste OURO acima do esperado: Avalia se o cashback para o nível "Ouro" está correto para um valor de compra próximo ao limite superior esperado.

ii. Quais entradas foram utilizadas no teste:

- Valor da compra: 1000.00
- Níveis de fidelidade: "Bronze", "Prata", "Ouro"
- Valores limite de cashback: 149.99, 150.01, 199.99, 200.01, 249.99, 250.01

iii. Qual é o resultado esperado do teste:

b. Descreva como você aplicou esse critério nos testes:

Para cada nível de fidelidade, o método calculaCashBack deve retornar o valor esperado dentro de uma margem de erro de 0.01.

Valores limite testados:

- 149.99 e 150.01 para o nível "Bronze"
- 199.99 e 200.01 para o nível "Prata"
- 249.99 e 250.01 para o nível "Ouro"

# Execução dos testes

a. Descreva o processo de execução dos testes: 
- Os testes foram executados automaticamente por meio de um framework de teste unitário, como JUnit. Cada método de teste foi executado para verificar se o valor de cashback retornado estava dentro do intervalo esperado para diferentes níveis de fidelidade e valores de compra próximos aos limites especificados.

b. Informe se todos os testes passaram ou se houve falhas: 
- Todos os testes passaram, indicando que a aplicação calculou corretamente os valores de cashback para os diferentes níveis de fidelidade e valores próximos aos limites testados.

c. 
- ![plot](/teste.png)

d. Quais foram os resultados dos testes projetados na análise do valor limite: 
- Os resultados confirmaram que a aplicação lida corretamente com os valores próximos aos limites definidos, retornando os valores de cashback esperados para cada cenário de teste.

e. Discuta qualquer problema encontrado ao testar esses limites: 
- Nenhum problema foi encontrado ao testar esses limites, pois todos os testes passaram. Não houve necessidade de corrigir o código ou ajustar os testes, pois a aplicação comportou-se como esperado em todos os casos de limite analisados.

# Conclusão

a. Resuma as descobertas feitas durante os testes: 
- Os testes de valor limite confirmaram que a aplicação calcula corretamente o cashback para diferentes níveis de fidelidade ("Bronze", "Prata", "Ouro") e para valores de compra próximos aos limites estabelecidos. Todos os testes passaram, indicando que a lógica de cashback está implementada de maneira robusta e funcional em situações de limite.

b. Avalie a robustez da aplicação com base nos resultados dos testes: 
- A aplicação demonstrou ser robusta, já que todos os testes de valor limite passaram sem falhas. Isso sugere que a aplicação é capaz de lidar adequadamente com situações críticas e extremos de entrada, fornecendo resultados precisos e consistentes, o que é essencial para manter a confiança do usuário e a integridade do sistema em produção.