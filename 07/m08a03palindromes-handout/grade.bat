@echo off
java -Xmx128m -ea -Dlog4j.skipJansi=false -jar .jgrader/jgrader-0.0.1.jar %*
