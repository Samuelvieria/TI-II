window.onload = function () {

    // Fetch, HTML para a div com ID expecifico -> NomeDoHTML + Copy

    fetch('../template/header.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('headerCopy').innerHTML = data;
        });

    fetch('../template/createRecipeModal.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('createRecipeCopy').innerHTML = data;
        });

    fetch('../template/footer.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('footerCopy').innerHTML = data;
        });

    fetch('../template/featureBoxes.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('featureBoxesCopy').innerHTML = data;
        });

    fetch('../template/categoriesBoxes.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('categoriesBoxesCopy').innerHTML = data;
        });

    fetch('../template/recipeModal.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('recipeModalCopy').innerHTML = data;
        });



}