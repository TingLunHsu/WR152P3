all: clean build run

build:
	javac *.java

run:
	java ChatBot

clean:
	-rm *.class