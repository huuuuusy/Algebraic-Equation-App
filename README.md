# Algebraic-Equation-App
I'd like to share my first project about Android APP development in this post. As a beginner in APP development, my first project is about an algebraic equation quiz. Users will answer ten questions about linear and quadratic equation, and the APP should judge the result with the correct answer to analysize their performance in this test. This blog is about some basic information of this APP.

# 1 Basic Information

I use Android Studio 2.3.3 to develop this APP and compile this in Nexus_S with API Level 23:5554.

This APP contains 3 pages: The start page, the quiz page(the first 5 questions are about linear equation and the next 5 questions are about quadratic equations) and the result page. Now I will introduce the functions in the following steps.

# 2 Start Page

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509779914/Screenshot_1509779718_imux2b.png)

The start page includes the title with two buttons. The **START** button links the quiz page, while the **ABOUT** button combines the URL of this webpage and will skip to this blog once click it.

# 3 Quiz Page

## 3.1 Linear Equation

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509780672/Screenshot_1509780598_equxn3.png)

The first 5 questions are about linear equation Ax+B=0 where A and B are two
random integers in the range [–99, 99]. The user will be asked to provide a
value of x in 2 decimal places. 

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509781313/Screenshot_1509780620_cseqlh.png)

Once the answer is verified as correct result, the UI will show **Right** with the total correct questions in green. What's more, the using time is defined as the duration from the page appearance to the **ENTER** button clicking.

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509781649/Screenshot_1509781502_beirax.png)

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509781651/Screenshot_1509781512_i0shqx.png)

For linear equation, click ENTER with nothing input will be regard as wrong. Empty input and incorrect input will return the **Error** with the correct answer in red. 

## 3.2 Quadratic Equation

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782154/Screenshot_1509781905_pdztr9.png)

Question 6 to 10 are about quadratic equation Ax^2 + Bx + C = 0 where A, B and
C are three random integers in the range [–99, 99]. Of course, the APP has verified that all the quadratic equations have real roots.

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782343/Screenshot_1509781990_eyel8r.png)

As linear equations, only two answers are verified as correct results will the UI shows the Right in green.

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782468/Screenshot_1509781935_q8fisw.png)

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782571/Screenshot_1509782066_h3sgym.png)

Empty input and incorrect input will be regard as wrong and return the **Error** information in red.

The differnce between the quadratic equation with the linear equation is the incomplete input. Input one correct answer and empty another will be regard as incomplete situation, while input one correct answer and one incorrect answer will be regard as error.

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782840/Screenshot_1509782025_nt0i4s.png)

The figure above shows the incomplete situation.

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509782895/Screenshot_1509782046_n0oghy.png) 

While correct answer combines with the incorrect input will be regard as wrong answer.

## 4 Result Page

![](http://res.cloudinary.com/dyy3xzfqh/image/upload/v1509861194/Screenshot_1509860680_gh6ddq.png)

This is the last page in the APP, in this page the user will get the feedback about his or her performance in this test. Different situations are displayed in different color to highlight. What's more, by click the source code below, you can get the source code of this App in GitHub.

