class Point {
	int x;
	int y;
	void setX(int newX) {
		this.x = newX;
	}
	void setY(int newY) {
		this.y = newY;
	}
	Point getPoint() {
		return this;
	}
	void movePoint(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	public String toString() {
		return "Pont(X=" + x + ", Y=" + y + ")";
	}
	Point() {
		this.x = 0;
		this.y = 0;
	}
}

class TestPoint {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.getPoint());
		p.movePoint(10, 20);
		System.out.println(p.getPoint());
	}
}