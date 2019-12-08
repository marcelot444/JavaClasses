package com.class27;

public class Student {
	public void aa() {
		System.out.println("Stuent is studying");
	}

	public void ab() {
		System.out.println("Student sleeps");
	}

	class SyntaxStudent extends Student{
		public void aa() {
			System.out.println("Student studies at Syntax");
		}

		public void bb() {
			System.out.println("Student goes to Chantily");
		}
	}

	class CollegeStudent extends Student {
		public void aa() {
			System.out.println("Student studies at college");
		}

		public void cc() {
			System.out.println("Student goes to Mason");
		}

	}

	class SchoolStudent extends Student {
		public void aa() {
			System.out.println("Student studies anywhere");
		}
		public void dd() {
			System.out.println("Student lives in fairfax");
		}

	}
}
