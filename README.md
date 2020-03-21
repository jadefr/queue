# queue
Fila em java

# Funcionamento

* FIFO (first in first out)
* Implementação baseada em linked-list
* A Fila guarda os nós head e tail
* Valores novos são inseridos no tail, com custo O(1)
* Remoção é feita no head, com custo O(1)

# Métodos

* enqueue(int data)
  * cria-se um nó novo com o valor data
  * este nó referencia o tail antigo e passa a ser o novo tail

* dequeue()
  * remove-se o nó head
  * a remoção do nó é feita tirando-se a referência a ele na Fila
  
* print()
  * printa a Fila

## Representação Gráfica

![Image of screenshot](https://raw.githubusercontent.com/jadefr/ontology-testing/master/queue.png)
