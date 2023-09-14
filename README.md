#HUNGER
- This is a Food Delivery Management System using Design Principles


#Implementing Searcher
1. Just like we have FoodItemSearcherAPI , We need to have a RestaurantSearcherAPI.
2. Similar to FoodItemSearcherAPI , Our RestaurantSearcherAP will have searchRestaurant() method which will take following sets of parameters
String restaurantName,
MealType mealType,
List<CuisineType> cuisineTypes , 
StarRating rating
Return Type of this method is List<Restaurant> and this will be a public method.
3. Here in return Type of above method, Restaurant will be another dataclass .
4. This Restaurant class will contain following sets of attributes
Private final int id ,
Private final string name ,
Private final string description,
Private final BusinessHours businessHours,
Private final MealType mealType,
Private final List<CuisineType> cuisineTypes,
Private final StarRating rating,
Private final Menu menu,
5. We can see that declaring above attributes we have got two new data classes emerges out i.e. BusinessHours and Menu .
6. We will create a data class BusinessHours , This class will contain two attributes
Private final LocalDateTime startTime;
Private final LocalDateTime endTime;
These will be initialized in the constructor and also have getters for themselves inside the class.
7. Similarly we will create a Menu data class.
8. We will also generate getters for Restaurant class.
9. Just like FoodItemSearcher , we will also need a RestaurantSearcher.
10. Similar to the interface  FoodItemFilter , we will have a RestaurantFilter interface.
11. This interface will contain a boolean method called boolean filter(Restaurant, restaurant);
12.  Since our restaurant needs the same filters i.e. CuisinesTypeFilters , MealTypeFilter, StarRatingFilter . We don’t need to create these classes again , instead we can make it implement both FoodItemFilter and RestaurantFilter just like shown below.
public class StarRatingFilter implements FoodItemFilter , RestaurantFilter
{
}
13. We will do this for all filter types.
14. Now coming to the RestauratSearcher class , it will contain a Search method with following parameters
String restaurantName, 
List<RestaurantFilters> filters,
And return type will be List<Restaurant>
15. The logic inside it is very much similar to the search method of the FoodItemSearcher class.

