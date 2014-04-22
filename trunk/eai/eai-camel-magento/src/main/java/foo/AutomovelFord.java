package foo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AutomovelFord implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		 // Object body = e.getIn().getBody();
		 // System.out.print("Automovel Ford "+ body);
		 Thread.sleep(1000);
	}

}
