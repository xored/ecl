package org.eclipse.ecl.console;

import java.util.LinkedList;

public class Content {

	private LinkedList<Entry> entries;

	public Content() {
		super();
		entries = new LinkedList<Entry>();
	}

	public void clear() {
		entries.clear();
	}

	public void add(String content) {
		entries.add(new Entry(content));
	}

	public void trim(int surplus) {
		int amountRemElements = getIndexByPos(surplus);
		if (amountRemElements == -1) {
			clear();
			return;
		}

		int startPos = getEntry(0).getPosition();
		for (int index = 0; index < amountRemElements; index++) {
			entries.removeFirst();
		}

		int delta = getEntry(0).getPosition() - startPos;
		for (int index = 0; index < entries.size(); index++) {
			getEntry(index).move(delta);
		}
	}

	protected int getIndexByPos(int position) {
		for (int index = 0; index < entries.size(); index++) {
			int pos = getEntry(index).getPosition();
			if (pos >= position) {
				return index;
			}
		}
		return -1;
	}

	public void mark(int position) {
		getEntry(entries.size() - 1).setPosition(position);
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		for (int index = 0; index < entries.size(); index++) {
			result.append(getEntry(index).getContent());
		}
		return result.toString();
	}

	protected Entry getEntry(int index) {
		return entries.get(index);
	}

	// ///////////////////////////////////////////////////////////////////////////////
	//
	// Content entry
	//
	// ///////////////////////////////////////////////////////////////////////////////
	public class Entry {
		private int y;
		private String content;

		public Entry(String content) {
			super();
			this.content = content;
			y = -1;
		}

		public int getPosition() {
			return y;
		}

		public void setPosition(int y) {
			this.y = y;
		}

		public void move(int dy) {
			this.y -= dy;
		}

		public String getContent() {
			return content;
		}
	}
}
