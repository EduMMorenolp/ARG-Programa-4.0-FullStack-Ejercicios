
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav>
      <ul>
        <li>
          <Link to={"./main1"}>Main1</Link>
        </li>
        <li>
          <Link to={"./main2"}>Main2</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;