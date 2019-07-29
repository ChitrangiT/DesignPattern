package Builder.DP;

class Email {
	
	private String emailId;
	private String subject;
	private String cc;
	private String message;
	private String header;
	private String footer;
	private String signature;
	
	private Email(EmailBuilder emailBuilder) {
		// TODO Auto-generated constructor stub
		this.header = emailBuilder.header;
		this.emailId = emailBuilder.emailId;
		this.footer = emailBuilder.footer;
		this.signature = emailBuilder.signature;
		this.message = emailBuilder.message;
		this.subject = emailBuilder.subject;
		this.cc = emailBuilder.cc;
	}
	
	
	public static class EmailBuilder{
		
		private String emailId;
		private String subject;
		private String cc;
		private String message;
		private String header;
		private String footer;
		private String signature;
		
	

		public EmailBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		
		public EmailBuilder setSubject(String subject) {
			this.subject = subject;
			return this;
		}

		public EmailBuilder setCc(String cc) {
			this.cc = cc;
			return this;
		}


		public EmailBuilder setMessage(String message) {
			this.message = message;
			return this;
		}
	
		public EmailBuilder setHeader(String header) {
			this.header = header;
			return this;
		}

		public EmailBuilder setFooter(String footer) {
			this.footer = footer;
			return this;
		}		

		public EmailBuilder setSignature(String signature) {
			this.signature = signature;
			return this;
		}		
		
		public EmailBuilder(String emailId, String subject) {
			this.emailId=emailId;
			this.subject=subject;
		}
		
		public Email build() {
			return new Email(this);
		}
		
	}
		
		


		
		
	
}
