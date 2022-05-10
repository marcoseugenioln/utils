import math
class Mathematic:
########################################################################################
    def fat(num):
        fatorial = 1
        x = 1
        while x <= num:
            fatorial = fatorial*x
            x += 1
        return fatorial
########################################################################################
    def quadraticEquation(a, b, c):
        delta = b**2-4*a*c
        if delta < 0:
            print('Não existem raízes no conjunto dos reais.')
            result = []
        else:
            x1 = (-b+(delta**-2))/2*a
            x2 = (-b-(delta**-2))/2*a
            result = [x1, x2]
            if x1 == x2:
                print('Raízes iguais.')
        return result
########################################################################################
    def mean(data):    
        if type(data) == int or type(data) == float:   
            result = data
        elif type(data) == list:
            sum = 0
            for number in data:
                sum = sum + number
            result = sum/len(data)
        else:
            result = 0
        return result
########################################################################################
    def max(data):
        if type(data) == int or type(data) == float:   
            max = data
        elif type(data) == list:
            max = 0
            for number in data:
                if number > max:
                    max = number
        else:
            max = 0
        return max
########################################################################################
    def min(data):
        if type(data) == int or type(data) == float:   
            min = data
        elif type(data) == list:
            min = 0
            for number in data:
                if number < max:
                    min = number
        else:
            min = 0
        return min
########################################################################################