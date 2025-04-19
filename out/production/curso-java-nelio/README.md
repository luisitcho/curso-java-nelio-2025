# Java com Docker


## Dockerfile

```
# Usa a imagem do OpenJDK 17 com base leve
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos do projeto para o container
COPY . .

# Comando padrão ao iniciar o container (pode ser sobrescrito)
CMD ["bash"]
```


## docker-compose.yml

```
version: '3.8'
services:
  app-java:
    image: app-java
    build: .
    volumes:
      - .:/app
    working_dir: /app
    command: ["bash"]
```

### Comandos para rodar o container

```
# Build da imagem
docker-compose build

# Subir o container em segundo plano
docker-compose up -d

# Verificar se o container está rodando
docker ps

# Acessar o terminal do container
docker-compose run --service-ports app-java

```
    
    
## Comandos Java dentro do container
   
Verificar a versão do java<br>
`java --version`

Compilar<br>
`javac aula1/Main.java`

Executar<br>
`java aula1.Main`