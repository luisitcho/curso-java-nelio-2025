# Usa a imagem do OpenJDK 17 com base leve
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos do projeto para o container
COPY . .

# Configura o PATH do Java para garantir que ele seja executável de qualquer lugar no container
ENV PATH="/usr/local/openjdk-17/bin:${PATH}"

# Compila todos os arquivos Java na raiz e nas subpastas
RUN find . -name "*.java" -exec javac {} \;

# Mantém o container rodando com um shell interativo
CMD ["bash"]