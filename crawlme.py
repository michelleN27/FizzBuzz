#Question 5

import urllib.request
import urllib.request
import urllib.error
import json


def xkcd_search(str):

	for x in range (1,2155):
		# num = str(x)
		URL = "https://xkcd.com/{0}/info.0.json".format(x);
		print (URL)
		try: 
			urllib.request.urlopen(URL)
			with urllib.request.urlopen(URL) as url:
				if url is None:
					print('page not found')
				
				data = json.loads(url.read().decode())	
				if str in data['alt'] :
					print (data['num'], ',',data['alt'])
					break	

		except urllib.error.URLError as e:
		    print(e.reason)
	
xkcd_search('river')
