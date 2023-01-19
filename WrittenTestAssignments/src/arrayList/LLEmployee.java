package arrayList;
//3.	WAP to create a LinkedList<Emp> and search for Emp object whose eno=10 and
//delete all the records whose dept is same as  eno 10.Emp(int id, String name Dept d)


import java.util.LinkedList;
import java.util.ListIterator;

public class LLEmployee {

	public static void main(String[] args) {

		LinkedList<Emp> e = new LinkedList();
		
		Dept d1 = new Dept();
		d1.setDname("Entc");
		
		Emp e1 = new Emp();
		e1.setId(1);
		e1.setEno(1);
		e1.setName("shree");
		e1.setD(d1);
		e.add(e1);
		
		
		Dept d2 = new Dept();
		d2.setDname("Comp");
		
		Emp e2 = new Emp();
		e2.setId(2);
		e2.setEno(11);
		e2.setName("Poojshree");
		e2.setD(d2);
		e.add(e2);
		
		Dept d3 = new Dept();
		d3.setDname("Entc");
		
		Emp e3 = new Emp();
		e3.setId(3);
		e3.setEno(10);
		e3.setName("pooja");
		e3.setD(d3);
		e.add(e3);
		
		/*
		 * for(Emp em : e) { if(em.eno == 10) { //System.out.println(em);
		 * System.out.println(em.d);
		 * 
		 * if(em.d.equals(em.d)) { e.remove(); //System.out.println(em); }
		 * 
		 * else { System.out.println(em); } } }
		 */
		String dp =" ";
		 for(Emp em : e) 
		 {
			 if(em.eno == 10) 
			 {
				 System.out.println(em);
					dp = em.d.dname;
			 }
		 }
		
		ListIterator<Emp> l = e.listIterator();
		
		while(l.hasNext())
		{
			if(l.next().d.dname.equals(dp))
			{
				l.remove();
			}
		}
		
		System.out.println(e);
	}		
		
		
		
		
		
		
		
		/*
		Dept d1 = new Dept("Entc");
		Emp e1= new Emp(1,1,"Pooja",d1);
		e.add(e1);
		
		Dept d2 = new Dept("Civil");
		Emp e2= new Emp(2,2,"Poojshree",d2);
		e.add(e2);
		
		Dept d3 = new Dept("Entc");
		Emp e3= new Emp(3,10,"shree",d3);
		e.add(e3);
		*/
		
		/*for(Emp em : e)
		{
			if(em.eno == 10)
			{
				//System.out.println(em);
				System.out.println(em.d);
			
			     if(!em.d.equals(em))
			     {
			    	 System.out.println(em);
			     }
		}
		}
		
		
		for(int i = 0;i< e.size();i++)
		{
			for(int j = i+1 ;j< e.size();j++)
			{
			if(e.get(i).eno ==  10)
			{
				if(e.get(i).d.dname.equals(e.get(j).d.dname))
				{
					System.out.println(e.get(i));
				}
			}
			}
		}
		*/
	}


