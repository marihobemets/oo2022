
function Navbar(){
    return(
    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <Link to="/">
                <a class="navbar-brand" href="#">Veebipood</a>
              </Link>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                  <div className="navbar-nav">
                    <Link to="lisa">
                      <div className="nav-link">Lisa toode</div>
                    </Link>
                    <Link to="halda">
                      <div className="nav-link">Halda toodet</div>
                    </Link>
                    <Link to="ostukorv">
                      <div className="nav-link">Ostukorv</div>
                    </Link>
                  </div>
                </div>   
            </div>                
          </nav>
        </div>
    );
}

export default Navbar;