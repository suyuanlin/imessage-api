package com.imessage.model;

/*
 * #%L
 * FocusSNS Model
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 分页模型
 * 
 * @author xiao.chang(cxiao84@hotmail.com)
 * 
 * @param <T>
 */
public class Pagination<T> {

	public static final String KEY = "page";

	private static final long TOTAL_COUNT_UNKNOW = -1L;

	protected int pageNo = 1;
	protected int pageSize = 10;
	protected boolean autoCount = true;
	protected List<Long> pageList;
	protected List<String> orderList = new ArrayList<String>();
	protected List<String> ascOrderList = new ArrayList<String>();
	protected List<String> descOrderList = new ArrayList<String>();

	protected List<T> results = new ArrayList<T>();
	protected long totalCount = -1L;

	public Pagination() {
	}

	/**
	 * 页数
	 * 
	 * @return
	 * @author Tkk
	 */
	public List<Long> getPageList() {
		if (pageList == null) {
			long cp = pageNo, mp = getTotalPages(), avgSize = 4;
			pageList = new LinkedList<Long>();

			// 只有1页
			if (cp == 1 && cp == mp) {
				pageList.add(cp);
			}
			//
			else {
				long s = cp - avgSize, // 判断之前是否够放
				e = cp + avgSize + (s < 0 ? Math.abs(s) : 0); // 之前不够放的话, 用后面叠加
				if (e > mp) {
					s = 1;
					e = mp;
				} else {
					long t = (e - cp) - (s < 0 ? Math.abs(s) : 0);
					s = s < 0 ? 0 : s;
					s = t == avgSize ? s : s - t;
				}
				for (; s <= e; s++) {
					pageList.add(s);
				}
			}
		}
		return pageList;
	}

	public int getPageNo() {
		return pageNo;
	}

	public Pagination<T> setPageNo(int pageNo) {
		this.pageNo = pageNo;
		if (pageNo < 1) {
			this.pageNo = 1;
		}
		return this;
	}

	public int getPageSize() {
		return pageSize;
	}

	public Pagination<T> setPageSize(int pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	public int getFirst() {
		return ((pageNo - 1) * pageSize) + 1;
	}

	public boolean isAutoCount() {
		return autoCount && totalCount == TOTAL_COUNT_UNKNOW;
	}

	public Pagination<T> setAutoCount(boolean autoCount) {
		this.autoCount = autoCount;
		return this;
	}

	public List<T> getResults() {
		return results;
	}

	public Pagination<T> setResults(List<T> results) {
		this.results = results;
		return this;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public Pagination<T> setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		return this;
	}

	public long getTotalPages() {
		if (totalCount < 0) {
			return -1L;
		}

		long count = totalCount / pageSize;
		if (totalCount % pageSize > 0) {
			count++;
		}
		return count;
	}

	public boolean isHasNext() {
		return (pageNo + 1 <= getTotalPages());
	}

	public int getNextPage() {
		if (isHasNext()) {
			return pageNo + 1;
		} else {
			return pageNo;
		}
	}

	public boolean isHasPre() {
		return (pageNo - 1 >= 1);
	}

	public int getPrePage() {
		if (isHasPre()) {
			return pageNo - 1;
		} else {
			return pageNo;
		}
	}

	//
	public List<String> getOrderList() {
		return orderList;
	}

	public List<String> getAscOrderList() {
		return ascOrderList;
	}

	public List<String> getDescOrderList() {
		return descOrderList;
	}

	public Pagination<T> asc(String column) {
		orderList.add(column + " ASC");
		ascOrderList.add(column);
		return this;
	}

	public Pagination<T> desc(String column) {
		orderList.add(column + " DESC");
		descOrderList.add(column);
		return this;
	}

}
