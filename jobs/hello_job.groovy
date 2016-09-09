job('hello') {
    steps {
        shell('''
        	echo "hello world"
    	'''.stripIndent())
    }
}
