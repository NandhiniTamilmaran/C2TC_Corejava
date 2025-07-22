package day2.entity;

public class customer {
	
		private int cid;
		private String cname;
		private String city;
		
		
		public customer(){
			this.cid=101;
			this.cname="Nandhini";
			this.city="Puducherry";
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "entity [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}
		
	
}

