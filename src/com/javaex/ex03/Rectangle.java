package com.javaex.ex03;

public class Rectangle {

	
	
		private int width;
		private int height;
		
		
		
		
		
		public Rectangle(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}





		@Override
		public boolean equals(Object obj) {
		
			if(this.height == ((Rectangle)obj).height && this.width ==((Rectangle)obj).width) {
				return true;
			}else {
				return false;
			}
			
				
			
			
		}
		
		
		
		
		
		
		
}
