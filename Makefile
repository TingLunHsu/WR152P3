all: clean build run

build:
	javac Main.java

run:
	java Main

clean:
	-rm *.class