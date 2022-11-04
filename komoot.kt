enum class Sport { HIKE, RUN, TOURING_BICYCLE, E_TOURING_BICYCLE }

data class Summary(val sport: Sport, val distance: Int)
    
fun main() {
	val sportStats = listOf(Summary(Sport.HIKE, 92),
        	Summary(Sport.RUN, 77),
                Summary(Sport.TOURING_BICYCLE, 322),
                Summary(Sport.E_TOURING_BICYCLE, 656))
    
    // Write kotlin code to print the top sport by distance excluding eBikes.
    val finalList = sportStats.filter {
        it.sport != Sport.E_TOURING_BICYCLE
    }.sortedBy {
        it.distance
    }.reversed()

    println("Final list: $finalList")
}