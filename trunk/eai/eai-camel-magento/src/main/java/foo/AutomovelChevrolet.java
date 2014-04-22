package foo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AutomovelChevrolet implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		 // Object body = e.getIn().getBody();
		 // System.out.print("Automovel Chevrolet "+ body);
		 Thread.sleep(1000);
	}

}
