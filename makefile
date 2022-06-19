#!/bin/bash
SHELL := bash

include ./make/print.lib.mk

.PHONY: help
help:
	$(call print_h1,"AVAILABLE","OPTIONS")
	$(call print_space)
	$(call print_options,"clean","Remove all generated data from the local machine.")
	$(call print_options,"dev","Run broker containers with open port 29092.")

.PHONY: clean
clean:
	@rm -Rf ./log/zookeeper/data/*
	@rm -Rf ./log/zookeeper/log/*
	@rm -Rf ./log/broker/data/*
	$(call print_h1,"FINISH","CLEAN")

.PHONY: dev
dev:
	$(call print_h1,"START","DEV")
	@docker-compose -f docker-compose.yml -f docker-compose.dev.yml up
