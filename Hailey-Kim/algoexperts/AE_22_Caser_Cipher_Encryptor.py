"""

Caeser Cipher Encryptor

06/17/2021
"""

def caesarCipherEncryptor(string, key):
    # 97 - 122
	arr = ['' for _ in range(len(string))]

    for x in string:
		converted = (ord(x) - 97 + key) % 26 + 97
		arr.append(chr(converted))

    return ''.join(arr)

    # O(n) T, O(n) S