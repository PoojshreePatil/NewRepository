package map;

public class FBuser 
  {
       int id;
       String name,email,gender,password,contact;
       
	public FBuser(int id, String name, String email, String gender, String password, String contact) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "\nFBuser [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", password="
				+ password + ", contact=" + contact + "]";
	}
    public int hashCode()
     {
	   return id; 
     }
      public boolean equals(Object o)
      {
    	  FBuser f = (FBuser) o;
    	  if(this.id == f.id)
    	  {
    		  this.name.equals(f.name);
    		      return true;
    	  }
    	  else
		      return false;
    	  
      }
  }
