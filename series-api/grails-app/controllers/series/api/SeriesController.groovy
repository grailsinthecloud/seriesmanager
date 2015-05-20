package series.api

class SeriesController {

	def tmdbService

    def index() {
    	render tmdbService.getTvPopular()
    }

}