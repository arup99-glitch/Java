<!DOCTYPE html>
<html>
<head>
<style>
	.formbody {
	  margin: auto;
      width: 32%;
      padding: 10px;
	}

	.title{
	  margin-left:32%;
	}

    .inputform {
      background-color: lightgrey;
      width: 300px;
      box-shadow: inset 0 -3em 3em rgba(0, 0, 0, 0.1), 0 0 0 2px rgb(255, 255, 255),
      0.3em 0.3em 1em rgba(0, 0, 0, 0.3);
      padding: 50px;
      margin: 30px;


    }
    input[type=text],input[type=number],input[type=date], select {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    input[type=submit] {
      width: 100%;
      background-color: #4CAF50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type=submit]:hover {
      background-color: #45a049;
    }

     .show {
          width: 90%;
          background-color: #4CAF50;
          color: white;
          padding: 10px 20px;
          margin: 6px 0;
          border: none;
          border-radius: 4px;
          cursor: pointer;
          margin-left:10%;
        }

        .show:hover {
          background-color: #45a049;
        }

</style>
</head>
<body>



<div class="formbody">
    <h2 class="title">Expense Manager<h2>
	<form class="inputform" action="insert.jsp" method="post">

    <form action="/action_page.php">
    <label for="expensecategory">Expense Category</label>
    <select id="expensecategory" name="expensecategory">
         <option value="Transportation">Transportation</option>
         <option value="Food">Food</option>
         <option value="Fees">Fees</option>
         <option value="Bills">Bills</option>
         <option value="Entertainment">Entertainment</option>
     </select>

     <label for="date">Date</label>
     <input type="date" id="date" name="date">

     <label for="fname">Expense Name</label>
     <input type="text" id="fname" name="expensename" placeholder="Expense name..">

     <label for="lname">Description</label>
     <input type="text" id="lname" name="description" placeholder="Description..">

     <label for="lname">Amount</label>
     <input type="number" id="lname" name="amount" placeholder="Amount">

     <input type="submit" value="Submit" />






</form>
<div>
       <button type="show" value="show" class="show" onclick="goToHome()">Show</button>
                <script>
                    function goToHome() {
                        window.location.href = "display.jsp";
                    }
                </script>
                </div>



</div>

</body>
</html>