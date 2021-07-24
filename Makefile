build-proto:
	mvn protobuf:compile
	mvn protobuf:compile-custom

verify-remove-stubs:
	find . -type d -name "stubs" -exec echo rm -rf {} \;

confirm-remove-stubs:
	find . -type d -name "stubs" -exec rm -rf {} \;