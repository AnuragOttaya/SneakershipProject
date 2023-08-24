# SneakershipProject
A Project for sneakerheads

Screens in the app :

   1. Sneakers List - In this screen all the available sneakers will be shown and users can tap on then to get the details on the perticular sneaker.
   2. Sneaker Details - In this page all the details about the selected sneaker will be shown. Details like Name, Descrition, Available Sizes, available color options, price and other related informations. In this page there is a Add To Cart button to add the selected sneaker in the cart.
   3. Search - In this page the user can search accross all available sneakers.
   4. Cart - In this page a list of snakers will be shown that are added by the user. In this page the user can see the total price and tax charges. There is a dummy checkout button as well.


Architecture used :

MVVM + Clean Architecture.

In Clean Architecture, the project stucture has 3 layers.
    - data (Reository)
    - domain (Here we store Use-Cases and Entities)
    - presentation (Here we implement the MVVM pattern)

Database 
  As Its a test dummy app, i havent implemented any real database and API calls.
  All the data are hardcoded and provied.




