<html>
    <head>
        <title>Library New Book </title>
    </head>
    <body>
        <h2>Library Management - New Books</h2>
        <hr />
        <form action="confirmAddBook" method="POST">
            <div>
                <label>Book Code: </label>
                <input type="number" name="bcode" required />
            </div>
            <div>
                <label>Book Name: </label>
                <input type="text" name="bname" required />
            </div>
            <div>
                <label>Book Price: </label>
                <input type="decimal" name="price" min="100.0" max="5500.0"  required />
            </div>
            <div>
                <label>Package Date: </label>
                <input type="date" name="packageDate" required />
            </div>
            <div>
                <button>Add Item</button>
            </div>
        </form>
    </body>
</html>