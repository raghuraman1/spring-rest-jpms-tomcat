module my.consumingmodule {
	requires transitive my.module;
	requires spring.context;
	exports my.consumingmodule.pub;
}