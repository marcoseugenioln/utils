class Mathematic:

    def calcFat(num):
        fatorial = 1
        x = 1
        while x <= num:
            fatorial = fatorial*x
            x += 1
        return fatorial
    
    def calcQuad(a, b, c):
        delta = b**2-4*a*c
        
