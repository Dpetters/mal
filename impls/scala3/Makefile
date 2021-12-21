SOURCES = step0_repl.scala
TARGET_DIR=target/scala-3.1.0

mal: $(TARGET_DIR)/mal.jar
	cp $< $@

all: $(TARGET_DIR)/mal.jar

dist: mal

$(TARGET_DIR)/mal.jar:
	sbt assembly

$(TARGET_DIR)/classes/step%.class: step%.scala $(SOURCES)
	sbt assembly

clean:
	rm -rf mal target

.PHONY: all clean dist
