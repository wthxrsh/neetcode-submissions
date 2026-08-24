class Solution:

    def encode(self, strs: list[str]) -> str:
        s = ""
        for word in strs:
            s += word + "*-"
        return s

    def decode(self, s: str) -> list[str]:
        res = []
        word = ""
        i = 0
        while i < len(s):
            if i + 1 < len(s) and s[i] == '*' and s[i+1] == '-':
                res.append(word)
                word = ""
                i += 2
            else:
                word += s[i]
                i += 1
        return res
