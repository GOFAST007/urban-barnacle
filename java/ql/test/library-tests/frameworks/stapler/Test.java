package generatedtest;

import org.kohsuke.stapler.framework.adjunct.AdjunctManager;

// Test case generated by GenerateFlowTestCase.ql
public class Test {

	Object source() {
		return null;
	}

	void sink(Object o) {}

	public void test() throws Exception {

		{
			// "org.kohsuke.stapler.framework.adjunct;AdjunctManager;true;AdjunctManager;(ServletContext,ClassLoader,String,long);;Argument[2];Argument[this].Field[org.kohsuke.stapler.framework.adjunct.AdjunctManager.rootURL];taint;ai-generated"
			AdjunctManager out = null;
			String in = (String) source();
			out = new AdjunctManager(null, null, in, 0L);
			sink(out.rootURL); // $ hasTaintFlow
		}

	}

}