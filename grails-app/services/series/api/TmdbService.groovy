package series.api

import groovyx.net.http.RESTClient
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class TmdbService {

	private String TMDB_API = 'https://api.themoviedb.org/3/'
	private String API_KEY = '4883683d8402af2dfc264b8d1fc64316'

    private get(path, query = [:]) {

    	def result

    	query.'api_key' = API_KEY

		def http = new HTTPBuilder('https://api.themoviedb.org/3/')

        http.request(Method.GET, ContentType.TEXT) {
            uri.path = path
            uri.query = query
            headers.'Accept' = 'application/json'
            response.success = { resp, reader ->
                result = reader.getText()
            }
        }

		return result

    }

    def getTvPopular() {

    	return get('tv/popular')

    }

}