/**
 * 
 */
package co.com.tac.repository.utils;

/**
 * @author john
 *
 */
public class Pagin {
	private int pageSize;
	private int page;

	public Pagin() {
		super();
	}

	public Pagin(int pageSize, int page) {
		super();
		this.pageSize = pageSize;
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}
