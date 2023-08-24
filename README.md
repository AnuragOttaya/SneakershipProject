Hello There. I am Anurag a passionate programmer.

## Sneak Peak of the Sneakership app
![git image](https://github.com/AnuragOttaya/SneakershipProject/assets/18247399/433fa94e-902b-409c-8bfa-7a427b8a14b3)

# Details about the app

### Screens in the app :

   - **Sneakers List**
      > *In this screen all the available sneakers will be shown and users can tap on then to get the details on the perticular sneaker.*
   - **Sneaker Details**
      > *In this page all the details about the selected sneaker will be shown. Details like Name, Descrition, Available Sizes, available color options, price and other related informations. In this page there is a Add To Cart button to add the selected sneaker in the cart.*
   - **Search**
     > *In this page the user can search accross all available sneakers.*
   - **Cart**
     > *In this page a list of snakers will be shown that are added by the user. In this page the user can see the total price and tax charges. There is a dummy checkout button as well.*

## Language used : Kotlin

## Project Structure Used : Multi-Module 
I implemented the project using the Multi Module method.  Every page the app containes, has been implemented in their own module. Which makes the code more separated, easily to modify and test. Each module is a library so we can reuse it in other project or even replace the moudle.

>For small projcts its an overkill, but for big projects its the best way to keep everythng clean.

## Architecture used : MVVM + Clean Architecture.

MVVM is enough for small projects, but when your codebase becomes huge, your ViewModels start bloating. Separating responsibilities becomes hard. MVVM with Clean Architecture is pretty good in such cases. It goes one step further in separating the responsibilities of your code base.

>Clean architecture is a method of software development in which you should be able to identify what a program performs merely by looking at its source code. 

In Clean Architecture, the code is divided into 3 separate layers.
   - **Presentation Layer**
     >(Acticities , Fragments, ViewModels)
   - **Domain Layer**
     >(Use Cases and Entiies)
   - **Data Layer**
     >(Repository)

## Technologies used
   - **Dagger Hilt**
     > For Dependancy Injection
   - **Navigation Framework**
     > For Fragment Navigation
   - **Kotlin Flows**
     > For observables
   - **Coroutines**
     > For consuming obsevables
   - **Data Bining**
     >For making the code more clean.

## Database used : Hardcoded Values
  As Its a test dummy app, i havent implemented any real database and API calls.
  All the sneaker data are generated locally with some random values and provided.
  The Repository return hardcoded data


## Thank you









