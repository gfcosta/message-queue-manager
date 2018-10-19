# message_queue_manager

Código fonte: [Message Queue Manager - RabbitMQ](https://wp.me/*********).

## Pré requisito

- Maven 3
- Java 8
- RabbitMQ 3.7.2

## Configurando RabbitMQ

- Acessar ```http://localhost:15672/#/queue```
- Criar Queue com o nome ```OrderQueue``` com o atribributo Durability ```Durable```

## Preparando ambiente

```sh
$ cd message_queue_manager
```
```sh
$ mvn clean package
```

## Executando 

#### Enviando pedidos para fila do RabbitMQ

```sh
$ cd message_queue_manager/sender
```
```sh
$ mvn spring-boot:run
```


#### Consumindo fila do RabbitMQ

```sh
$ cd message_queue_manager/consumer
```
```sh
$ mvn spring-boot:run
```
