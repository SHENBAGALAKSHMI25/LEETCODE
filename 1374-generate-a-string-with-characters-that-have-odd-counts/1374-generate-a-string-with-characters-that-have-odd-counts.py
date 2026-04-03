class Solution(object):
    def generateTheString(self, n):
        if(n%2!=0):
            return "a"*n
        else:
            n=n-1
            return "a"*n+ "b"