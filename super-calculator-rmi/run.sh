# chmod +x run.sh
# ./run.sh
javac SuperCalculator.java
javac SuperCalculatorImpl.java
javac SuperCalculatorServer.java
javac SuperCalculatorClient.java
javac LocalConfig.java
rmic SuperCalculatorImpl
java SuperCalculatorServer

# Em outro terminal: java SuperCalculatorClient <argumento1> <argumento2>
