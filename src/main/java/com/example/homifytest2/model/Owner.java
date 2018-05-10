package com.example.homifytest2.model;

	public class Owner 
	{
		private String id;
		private String name;
		private String description;
		private String displayname;
		private String phone;
		private String email;
		private Object website;
		private String city;
		private String country;

		public Owner() {

		}

		public Owner(String displayname, String phone, String email, String website, String city, String country ) 
		{
			super();
			this.displayname = displayname;
			this.phone       = phone;
			this.email       = email;
			this.website     = website;
			this.city        = city;
			this.country     = country;
		}
}
