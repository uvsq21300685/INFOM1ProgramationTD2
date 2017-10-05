package exo31;


public class compte {
	
	public static void main(String[] args)
	{
		System.out.println("hello");
	}

		private int solde;
		
		private compte( int solde)
		{
			this.solde =solde;
		}
		
		public int getSolde()
		{
			return solde;
		}
		
		public int credit(int cred)
		{
			if(cred < 0){return solde;}
			if(cred >= solde){return solde;}
			solde = solde + cred;
			return solde;
		}
		
		public int debit(int deb)
		{	
			if(deb < 0){return solde;}
			int tmp = solde - deb;
			if(tmp < 0){
				return solde;
			}
			return tmp;
		}
		
		public int virement(compte comp ,int vir)
		{
			if(vir < 0){return solde;}
			if(vir >= solde){return solde;}
			if(this.solde >= vir){
				this.solde = this.solde - vir;
				comp.solde = comp.solde + vir;
				return this.solde;
			}
			return solde;
			
		}
	}


