# Usar a imagem do OpenJDK 8
FROM openjdk:8-jdk

# Definir o diretório de trabalho
WORKDIR /app

# Instalar wget para baixar o Randoop
RUN apt-get update && \
    apt-get install -y wget unzip && \
    rm -rf /var/lib/apt/lists/*

# Baixar o Randoop
RUN wget https://github.com/randoop/randoop/releases/download/v4.3.1/randoop-4.3.1.zip && \
    unzip randoop-4.3.1.zip && \
    rm randoop-4.3.1.zip

# Copiar os arquivos do projeto para o container
COPY ./src ./src

# Criar o diretório para os arquivos .class
RUN mkdir -p /app/classes

# Compilar o projeto Java, salvando os arquivos .class na pasta /app/classes
RUN javac -d ./classes ./src/calculadora/*.java

# Criar o diretório para os testes gerados
RUN mkdir -p /app/generated_tests

# Comando para rodar o Randoop e salvar os testes em generated_tests
CMD ["java", "-cp", "./randoop-4.3.1/randoop-all-4.3.1.jar:./classes", "randoop.main.Main", "gentests", "--testclass=calculadora.Calculadora", "--testclass=calculadora.Matematica", "--junit-package-name=generated_tests", "--junit-output-dir=./generated_tests"]
