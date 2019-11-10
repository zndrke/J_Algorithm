1.     출력

1)    n = 32

![img](<https://user-images.githubusercontent.com/45009100/68547992-8930c100-042b-11ea-958c-be9aee1a310c.png>)

![img](<https://user-images.githubusercontent.com/45009100/68547997-964db000-042b-11ea-8131-f2c0a18baf26.png>)

 

2)   n =1024

![img](<https://user-images.githubusercontent.com/45009100/68548001-9d74be00-042b-11ea-9415-321a7aef9bc3.png>) 

![img](<https://user-images.githubusercontent.com/45009100/68548003-a06fae80-042b-11ea-8591-b6b05fcd6254.png>)

2.  요약 정리



1)  n = 32

랜덤 입력에서 가장 빠른 정렬 : Insertion_sort

-    클럭 타임: 664300 , 비교횟수 : 193

랜덤 입력에서 가장 느린 정렬 : Merge_sort

-    클럭 타임: 8399700 , 비교횟수 : 1026000

이미 정렬된 경우 가장 빠른 정렬 : Insertion_sort

-    클럭 타임: 21500 , 비교횟수 : 

이미 정렬된 경우 가장 느린 정렬 : 마지막을 피벗으로 사용한 Quick_sort

-    클럭 타임: 110200 , 비교횟수 : 642



랜덤 입력에서 빠른 순으로 나열

Insetion > Quick(MOT) > Heap > Quick(last)> Quick(Random) > Merge

 

이미 정렬된 경우 빠른 순으로 나열

Insertion> Quick(MOT) > Merge > Quick(Random) > Heap > Quick(last)

 

 

 

 

2)  n = 1024

랜덤 입력에서 가장 빠른 정렬 : Heap_sort

-    클럭 타임: 1789700 , 비교횟수 : 10392

랜덤 입력에서 가장 느린 정렬 : Insertion_sort

-    클럭 타임: 8399700 , 비교횟수 : 264590

이미 정렬된 경우 가장 빠른 정렬 : Insertion_sort

-    클럭 타임: 21500 , 비교횟수 : 1023

이미 정렬된 경우 가장 느린 정렬 : 마지막을 피벗으로 사용한 Quick_sort

-    클럭 타임: 7988100 , 비교횟수 : 531985



랜덤 입력에서 빠른 순으로 나열

Heap > Quick(last) > Merge > Quick(MOT)> Quick(Random) > Insertion

 

이미 정렬된 경우 빠른 순으로 나열

Insertion > Quick(MOT) > Merge >Quick(Random) > Heap > Quick(last) 

  

1)  각 정렬의 특징

Insertion

-    n^2의 알고리즘

-    이미 정렬된 경우 빠름

-    n이 작을 때 다른 알고리즘 보다 빠름



Heap

-    nlogn의 알고리즘

-    n이 1024일 때 가장 빠른 모습을 보임 

-    다른 알고리즘에 비해 오버헤드가 적어 빠른 것으로 추측



Merge

-    Nlogn의 알고리즘

-    N이 32 일 때 가장 느린 것을 제외하고 항상 중간정도 성능

-    이미 정렬된 경우 비교적 빠른 특징

-    비교 횟수가 다른 알고리즘에 비해 적은 편



​       Quick(last pivot)

-    Nlogn의 알고리즘

-    N이 작은 경우는 성능이 좋지 못하나, n이 큰 경우 좋은 성능

-    Random한 입력일 때 성능이 좋음

-    이미 정렬된 경우 최악의 성능을 보여줌



Quick(random)

-    일반적인 경우 다른 nlogn의 알고리즘에 비해 성능이 저조함

-    이론적으로는 빠를 것 같으나 실제로는 Random number generator를 자주 사용해야 하기 때문에 오버헤드가 큰 것으로 추측됨



Quick(Median of Three)

-    N이 작을 때 Quick 알고리즘 중에 가장 좋은 성능을 보임

-    이미 정렬된 경우에 대해서도 효과적인 모습

-    단, n이 크고 Random한 입력에서는 중간 값을 구하는 연산 때문에  Last pivot 보다 느린 모습을 보임



3.  교훈



 이론적으로 배운 알고리즘을 실제 코딩으로 구현하면서 이론과 실제의 차이에 대해서 알게 되었다. 이론과 실제가 다른 원인을 여러가지가 있지만 크게 오버헤드로 설명할 수 있다. 예를 들면 이론만 배웠을 때는 Quick 정렬에서 Random으로 pivot을 정하는 것이 빠를 것 같았다. random으로 pivot을 뽑을 경우 극단의 pivot을 뽑을 가능성이 매우 적어지고 따라서 빠른 알고리즘이 될 것이라고 생각했다. 하지만 실제 구현 결과 Quick 알고리즘 중에 Random이 가장 낮은 성능을 보여준다. 이는 Randomnumber generator를 사용해서 random한 pivot을 고르기 때문에 오버헤드가 큰 것으로 추측된다. 

 Quick의 알고리즘은 매우 뚜렷한 특징을 보인다. 먼저 last pivot은 일반적인 경우 가장 좋은 성능을 보여준다. Pivot을 고르는데 많은 노력을 하지 않아서 오버헤드가 적기 때문이다. 하지만 이미 정렬된 경우 n^2의 insertion 알고리즘보다 낮은 성능을 보여준다. 

 Median ofthree는 어느 경우에도 안정적으로 빠른 성능을 보여준다. Pivot이 극단에 치우칠 염려도 없고 따라서 이미 정렬된 경우에도 빠른 모습을 보여준다. 다만 random하고 n이 큰 경우 last pivot 보다 느린 성능을 보여준다. 이는 중간 값을 찾는 연산이 Last pivot에 추가되기 때문으로 당연한 결과이다. 안정성을 얻었지만 속도 면에서 약간 떨어진 모습이다.

 Merge 역시 매우 안정적인 모습을 보인다. 항상 2T(n/2)로 divide하고 merge하는 과정에서 점진적으로 conquer하기 때문에 항상 준수한 모습을 보여준다. 다만 2n의 저장공간이 필요하고 divide & conquer 를 사용하기 때문에 recursion으로 발생하는 오버헤드가 크다. 따라서 n이 작은 경우 좋지 못한 성능을 보여준다. 

 마지막으로 Heap 정렬은 n이 큰 경우 가장 빠른 모습을 보여주는 것이 인상적이. 이론적으로는 Quick이 가장 빠를 것 같으나 비교가 적고 오버헤드가 적은 heap이 n이 가장 큰 경우에서 가장 빠른 모습을 보인다. 다만 이미 정렬된 경우 비교가 많아지고 따라서 성능이 떨어지는 모습을 보인다. 

 이번 구현을 통해서 알게 된 사실은 절대적인 알고리즘은 없다는 것이다. 무조건 빠를 것 같은 quick 정렬도 이미 정렬된 경우 느린 모습을 보여준다. 이미 정렬된 경우를 개선하기 위해 median of three나 random을 사용해 봤지만 이 또한 단점이 존재한다. 그리고 n이 크면 무조건 느릴 것이라 생각된 insertion 역시 이미 정렬된 경우 가장 빠른 모습을 보이다. 

 따라서 알고리즘을 적용하여 문제를 해결해야 하는 개발자는 모든 알고리즘에 대한 이해가 필요하다. 이를 바탕으로 적재적소에 알고리즘을 사용하는 능력이 필요하다. 만능 알고리즘은 존재하지 않고 개발자가 알고리즘을 적절하게 사용하여 최대의 성능으로 코드를 구현해야 한다는 것을 느꼈다.

 
