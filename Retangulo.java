class Retangulo{
	int altura, base;

	public void Calcula_Area(){
		System.out.println("A area do Retangulo eh: " + this.base * this.altura);
	}
	
	public void Calcula_Perimetro(){
		System.out.println("O perimetro do Retangulo eh: "+ (2 * this.base + 2 * this.altura));
	}
}