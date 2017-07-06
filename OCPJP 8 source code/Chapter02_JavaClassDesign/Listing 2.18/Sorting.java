/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.awt.List;

interface Sorting {
	List sort(List list);
}

class MergeSort implements Sorting {
	public List sort(List list) {
		// sort implementation
		return list;
	}
}

class QuickSort implements Sorting {
	public List sort(List list) {
		// sort implementation
		return list;
	}
}

class DynamicDataSet {
	Sorting sorting;
	public DynamicDataSet() {
		sorting = new MergeSort();
	}
	// DynamicDataSet implementation
}

class SnapshotDataSet {
	Sorting sorting;
	public SnapshotDataSet() {
		sorting = new QuickSort();
	}
	// SnapshotDataSet implementation
}
