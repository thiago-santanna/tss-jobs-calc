import React from 'react';
import { FiArrowLeft } from "react-icons/fi";

const NavForm = () => {
  return (
    <nav className="bg-gray-800">
      <div className=" container mx-auto text-white relative flex items-center justify-between h-16">
        <span><FiArrowLeft size={24} /></span>
        <span>Meu Perfil</span>
        <span>...</span>
      </div>
    </nav>
  );
}

export default NavForm;
