package net.rubyeye.xmemcached;

/**
 * gets命令结果
 * 
 * @author dennis
 * 
 */
public class GetsResponse {
	private long cas;
	private Object value;

	public GetsResponse(long cas, Object value) {
		super();
		this.cas = cas;
		this.value = value;
	}

	public long getCas() {
		return cas;
	}

	public void setCas(long cas) {
		this.cas = cas;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
