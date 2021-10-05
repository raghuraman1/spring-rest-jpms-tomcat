open module my.modular.web.attempt {

	
	requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires org.apache.tomcat.embed.core;
   // requires org.apache.commons.compress;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires my.consumingmodule;


}
